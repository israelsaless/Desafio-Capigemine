package Models;

import java.util.Collections;
import java.util.List;

public class MedianaArray {

	public static int medianaList(List<Integer> list) {
		Collections.sort(list);
		
		int meioLista = list.size() / 2;
		
		return list.get(meioLista);
	}
	
}
