package com.example.moviex2.Movies;

import java.util.ArrayList;


public class Moviedata {

    public static String[][] data = new String[][]{
            {"Spiderman : Into The Spider Verse", "Action, Animation, Family", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg", "8.4/10", "1h 34m", "Shameik Moore, Hailee Steinfeld, Jake Johnson", "Rodney Rothman", "Sony Pictures", "February 19, 2019", "USA", "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."},
            {"Aquaman", "Action, Adventure, Fantasy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg", "6.8/10", "2h 24m", "Jason Momoa, Amber Heard", "James Wan", "DC Comics", "March 26, 2019", "USA", "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orms half-human, half-Atlantean brother and true heir to the throne."},
            {"Avengers Infinity War", "Action, Adventure, Fantasy", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", "8.3/10", "2h 29m", "Robert Downey Jr., Chris Hemsworth, Chris Evans, Mark Ruffalo, Scarlett Johansson", "Joe Russo, Antony Russo", "Marvel Entertainment", "August 14, 2018", "USA", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."},
            {"Bird Box", "Thriller, Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/rGfGfgL2pEPCfhIvqHXieXFn7gp.jpg", "7.0/10", "2h 4m", "Sandra Bullock, Trevante Rhodes", "Susanne Bier", "Netflix", "November 12, 2018", "USA", "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety."},
            {"Bohemian Rhapsody", "Music, Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg", "8.1/10", "2h 15m", "Rami Malek, Gwilym Lee, Ben Hardy", "Anthony McCarten", "Fox Movies", "October 30, 2018", "USA", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock n roll band Queen in 1970. Hit songs become instant classics. When Mercurys increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."},
            {"Bumblebee", "Action, Adventure, Sci-fi", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg", "7.3/10", "2h 13m", "Hailee Steinfeld, Jorge Lendeborg Jr.", "Travis Knight", "Fox Movies", "December 21, 2018", "USA", "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug"},
            {"Creed", "Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hKzhV274pkZBSpXfCjUyzbyYKLl.jpg", "7.6/10", "1h 44m", "Michael B. Jordan, Sylvester Stallone", "Ryan Coogler", "Fox Movies", "November 25, 2015", "USA", "The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed."},
            {"Dragon Ball", "Action, Animation, Family", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/79C1S70I2nR4o0WpVETIezT3jyG.jpg", "7.6/10", "1h 10m", "Masako Nozawa, Bin Shimada, Iemasa Kayumi", "Shigeyasu Yamauchi", "Bandai", "February 12, 2016", "Japan", "As Goku investigates the destruction of the Southern Galaxy, Vegeta is taken to be King of the New Planet Vegeta, and to destroy the Legendary Super Saiyan, Broly."},
            {"Glass", "Thriller, Drama", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg", "7.3/10", "2h 9m", "James McAvoy, Bruce Willis, Samuel L. Jackson", "M.Night Shyamalan", "ScreenPlay", "February 22, 2019", "USA", "Captain Glass of the USS Arkansas discovers that a coup détat is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war."},
            {"Hunter Killer", "Thriller, Action", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/a0j18XNVhP4RcW3wXwsqT0kVoQm.jpg", "6.5/10", "2h 2m", "Gerard Butler,Gary Oldman, Toby Stephens", "Donovan Marsh", "ScreenPlay", "March 6, 2019", "USA", "In Depression-era London, a now-grown Jane and Michael Banks, along with Michaels three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives"},
            {"Venom", "Action, Sci-fi", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg", "6.6/10", "1h 52m", "Tom Hardy, Michelle Williams", "Ruben Fleishcer", "Sony Pictures", "October 1, 2018", "USA", "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."}

    };

    public static ArrayList<Movie> getListData() {
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            movie = new Movie();
            movie.setTitle(aData[0]);
            movie.setGenre(aData[1]);
            movie.setPhoto(aData[2]);
            movie.setRating(aData[3]);
            movie.setDuration(aData[4]);
            movie.setActors(aData[5]);
            movie.setDirectors(aData[6]);
            movie.setProduction(aData[7]);
            movie.setReleaseDate(aData[8]);
            movie.setCountry(aData[9]);
            movie.setDesc(aData[10]);

            list.add(movie);
        }

        return list;
    }
}

