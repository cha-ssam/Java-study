package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview m1 = new MovieReview();
        MovieReview m2 = new MovieReview();

        m1.title = "인셉션";
        m1.review = "인생은 무한루프" ;
        m2.title = " 어바웃 타임";
        m2.review = "인생 시간 영화";

        MovieReview[] movies = new MovieReview[] {m1,m2};


        for (MovieReview movie : movies) {
            System.out.println("영화 제목 : " + movie.title + ", 영화 리뷰 : " + movie.review);

        }

    }
}
