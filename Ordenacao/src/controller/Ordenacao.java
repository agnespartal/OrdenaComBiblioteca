package controller;

import br.fateczl.ads.BubbleSort;
import br.fateczl.ads1.MergeSort;

public class Ordenacao {

	public Ordenacao() {
		super();
	}

	public void ordenacaoBubble (int[]vetor) {
		BubbleSort ordena = new BubbleSort();
		int[] resultado = ordena.ordenaBubble(vetor);
		for (int valor:resultado ){
			System.out.print(valor + " ");
		}
	}
	
	public void ordenacaoMergeSort (int[]vetor) {
		MergeSort ordena = new MergeSort();
		int[] resultado = ordena.ordenaMerge(vetor, 0, vetor.length - 1);
		for (int valor : resultado) {
			System.out.print(valor + " ");
		}
	}
}
