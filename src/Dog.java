public class Dog {
    private String _name;
    private String _race;
    private Integer _age;
    private Integer _weight;
    private Integer _tailLength;

    public Dog(String name, String race, int age, int weight)
    {
        _name = name;
        _race = race;
        _age = age;
        _weight = weight;
        _tailLength = (_age*_weight)/10;
    }
    public void IncreaseAge(){
        _age++;
        _tailLength = (_age*_weight)/10;
    }
    public String GetName(){
        return _name;
    }
    public String GetRace(){
        return _race;
    }
    public int GetAge(){
        return _age;
    }
    public int GetWeight(){
        return _weight;
    }
    public int GetTailLength(){
        return _tailLength;
    }
}
