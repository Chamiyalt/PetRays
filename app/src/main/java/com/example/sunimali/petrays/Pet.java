package com.example.sunimali.petrays;

public class Pet {
    private String name;
    private String age;
    private String specie;
    private String breed;
    private String Dp;
    private String weight;

    public Pet() {
    }



    public Pet(String name, String age, String specie, String breed, String dp, String weight) {
        this.name = name;
        this.age = age;
        this.specie = specie;
        this.breed = breed;
        Dp = dp;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }

    public String getSpecie() {
        return specie;
    }

    public String getBreed() {
        return breed;
    }

    public String getDp() {
        return Dp;
    }

    public String getWeight() {
        return weight;
    }

}
