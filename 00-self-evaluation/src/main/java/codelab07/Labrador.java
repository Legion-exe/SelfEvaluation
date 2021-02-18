package codelab07;

public class Labrador extends Dog {
   String name;
    int averageBreedWeight;

    public Labrador(String name,int averageBreedWeight) {
        this.name = name;
        this.averageBreedWeight=35;    }


    }

    public String Bark() {
        bark = "WOOF WOOF";
        return bark;

    }

    @Override
    public String toString() {
        String decl="Labrador: (name = "+ name+", sound = "+ bark +", average breed weight = "+avWeigth+")";
        return decl;
    }
}
