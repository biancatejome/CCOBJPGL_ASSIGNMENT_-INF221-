package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Spaceship now landing... Exploring Planet Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Spaceship now landing... Exploring Planet Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Spaceship now landing... Exploring Planet Saturn");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Spaceship now landing... Exploring Planet Venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Spaceship now landing... Exploring Planet Earth");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Spaceship now landing... Exploring Planet Jupiter");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Spaceship now landing... Exploring Planet Uranus");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Spaceship now landing... Exploring Planet Neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Spaceship now landing... Exploring Planet Pluto");
    }

}
