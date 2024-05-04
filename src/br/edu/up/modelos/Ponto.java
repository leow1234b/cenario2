package br.edu.up.modelos;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this(0, 0);
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.getX() - x, 2) + Math.pow(outroPonto.getY() - y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

