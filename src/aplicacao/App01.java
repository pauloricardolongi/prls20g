package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;
import util.PrecoUpdate;

public class App01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("Tv", 900.0));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.00));
		list.add(new Produto("HD Case", 80.90));
		
		list.forEach(new PrecoUpdate());
		list.forEach(System.out::println);

	}

}
