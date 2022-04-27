package ie.tudublin;

public class Nematodes
{
    private String names;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    public String toString() {
        return "nematodes[ names=" + names + ", length=" + length +", limbs=" + limbs +", gender=" + gender +", eyes=" + eyes +"}";
    }


public Nematodes(TableRow tr)
{
    this(
        tr.getString("names"),
        tr.getInt("length"),
        tr.getInt("limbs"),
        tr.getString("gender"),
        tr.getInt("eyes")

    );
}

public Nematodes(String names, int length, int limbs, String gender,int eyes) {
    this.names = name;
    this.length = length;
    this.limbs = limbs;
    this.gender = gender;
    this.eyes = eyes;
}


}