package com.kaoutar;

import boissons.Boisson;
import boissons.Cafe;
import boissons.Cola;
import deco.Chocolat;
import deco.Noisette;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boisson boisson;
//        boisson = new Cola();
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());

        boisson = new Cafe();
        System.out.println(boisson.cout());
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

        System.out.println("--------------------");

        boisson = new Noisette(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

        System.out.println("================");
        //Liste enchaînée des objets
        Boisson boisson1 = new Chocolat(new Noisette(new Cafe()));
        System.out.println(boisson1.getDescription());
        System.out.println(boisson1.cout());
        }

    }
