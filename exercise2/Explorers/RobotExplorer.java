package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Mecury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Saturn");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Venus");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Earth");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Jupiter");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Uranus");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Neptune");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Beep beep... Planet Detected... Landing cleared... Proceed to exploring Pluto.");
    }
}