package it.fucarino.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.fucarino.model.*;

@Controller
public class indexController {
	
	@GetMapping("/home")
	public String Index() {
		return "index";
	}
	

	@GetMapping("/movies")
	public String Movie(Model model) {
		List<Movie> movieList = new ArrayList<>();
		Movie oppenheimerMovie = new Movie();
		oppenheimerMovie.setId(1);
		oppenheimerMovie.setNameString("oppenheimer");
		movieList.add(oppenheimerMovie);
		
		Movie coldwarMovie = new Movie();
		coldwarMovie.setId(2);
		coldwarMovie.setNameString("COLD WAR");
		movieList.add(coldwarMovie);
		
		Movie lostMovie = new Movie();
		lostMovie.setId(3);
		lostMovie.setNameString("LOST");
		movieList.add(lostMovie);
		
		Movie breakingbadMovie = new Movie();
		breakingbadMovie.setId(4);
		breakingbadMovie.setNameString("BREAKING BAD");
		movieList.add(breakingbadMovie);
		
		model.addAttribute("movieList", movieList);
		
		return "movies";
	}
	
	@GetMapping("/songs")
	public String Song(Model model) {
		List<Song> songsList = new ArrayList<>();
		
		Song blacknirvanaSong = new Song();
		blacknirvanaSong.setId(1L);
		blacknirvanaSong.setName("BLACK NIRVANA - ELODIE");
		songsList.add(blacknirvanaSong);
		
		Song karmaSong = new Song();
		karmaSong.setId(2L);
		karmaSong.setName("KARMA - THE KOLORS");
		songsList.add(karmaSong);
		
		
		Song malavitaSong = new Song();
		malavitaSong.setId(3L);
		malavitaSong.setName("MALAVITA - COMA_COSE");
		songsList.add(malavitaSong);
		
		
		Song ratataSong = new Song();
		ratataSong.setId(4L);
		ratataSong.setName("RA TA TA - MAHMOOD");
		songsList.add(ratataSong);
		
		model.addAttribute("songsList", songsList);
		
		return "songs";
	}
}
