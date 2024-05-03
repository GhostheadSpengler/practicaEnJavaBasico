public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidx a nuestro Catalogo");
        System.out.println("Pelicula: Harry Potter");


        int lanzamiento=2000;
        boolean disponible= true;
        double evaluacion= 9.5;
        double promedio= (2.5 + 8.5 + 9.0 + 7.00) / 4;

        System.out.println(promedio);

        String info= """
                La serie cinematográfica de Harry Potter comprende ocho películas basadas en Harry Potter, una serie de siete novelas juveniles escritas por la autora británica J. K. Rowling y protagonizadas por el mago ficticio del mismo nombre. Se trata de películas de cine fantástico, todas basadas en las novelas de la saga y todas estrenadas en el decenio comprendido entre""" + lanzamiento + """
                y 2011.1​ Se realizó una película por cada libro de la saga a excepción del último libro, cuya adaptación cinematográfica ocupó dos películas distintas.""";

        System.out.println(info);
    }
}