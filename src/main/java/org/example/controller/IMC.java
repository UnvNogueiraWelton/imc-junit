package org.example.controller;

public class IMC {

    public String calc(double weight, double height, int age, String gender) {
        double imc = weight / (height * height);

        if (age >= 20 && age <= 65) {
            return getAdultIMC(imc);
        } else if (age > 65) {
            if (gender.equalsIgnoreCase("female")) {
                return getFemaleElderlyIMC(imc);
            } else {
                return getMaleElderlyIMC(imc);
            }
        } else {
            return "Hello World";
        }
    }

    public String getAdultIMC(double imc) {
        if (imc < 16) {
            return "Baixo peso muito grave";
        } else if (imc >= 16 && imc < 17) {
            return "Baixo peso grave";
        } else if (imc >= 17 && imc < 18.5) {
            return "Baixo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }

    public String getFemaleElderlyIMC(double imc) {
        if (imc < 21.9) {
            return "Baixo peso";
        } else if (imc >= 21.9 && imc <= 27) {
            return "Peso normal";
        } else if (imc > 27 && imc <= 32) {
            return "Sobrepeso";
        } else if (imc > 32 && imc <= 37) {
            return "Obesidade grau I";
        } else if (imc > 37 && imc < 42) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }

    public String getMaleElderlyIMC(double imc) {
        if (imc < 21.9) {
            return "Baixo peso";
        } else if (imc >= 21.9 && imc <= 27) {
            return "Peso normal";
        } else if (imc > 27 && imc <= 30) {
            return "Sobrepeso";
        } else if (imc > 30 && imc <= 35) {
            return "Obesidade grau I";
        } else if (imc > 35 && imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }
}