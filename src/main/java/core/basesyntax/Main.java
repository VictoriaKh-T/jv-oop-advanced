package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    
    public static void main(String[] args) {
        
        Figure[] figures = new Figure[new Random().nextInt(10 + 1)];
        
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].draw());
        }
    }
}
