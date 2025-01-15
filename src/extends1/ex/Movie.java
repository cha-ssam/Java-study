package extends1.ex;

public class Movie extends Item{
    private String director;
    private String actors;

    public Movie(String name,int price, String director, String actors) {
        super(name, price);
        this.director = director;
        this.actors = actors;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(" -감독: " + this.director + ",  배우: " + this.actors);
    }

}
