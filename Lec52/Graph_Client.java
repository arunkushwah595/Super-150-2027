package Lec52;

import java.util.HashSet;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7); // 7 vertices from 1 to 7
		g.AddEdge(1, 4, 2);
		g.AddEdge(1, 2, 5);
		g.AddEdge(3, 2, 7);
		g.AddEdge(3, 4, -1);
		g.AddEdge(5, 4, 3);
		g.AddEdge(5, 6, 7);
		g.AddEdge(5, 7, 8);
		g.AddEdge(5, 6, 4);
		g.Display();
		System.out.println(g.HasPath(1, 6, new HashSet<>()));
		g.PrintPath(1, 6, new HashSet<>(), "");

//		------------------------------------------------------------------------------------------

		Graph g2 = new Graph(7);
		g2.AddEdge(1, 7, 2);
		g2.AddEdge(1, 2, 1);
		g2.AddEdge(2, 6, 3);
		g2.AddEdge(2, 3, 4);
		g2.AddEdge(6, 7, 8);
		g2.AddEdge(6, 5, -2);
		g2.AddEdge(3, 4, 5);
		g2.AddEdge(4, 5, 3);
		g2.Display();
		g2.PrintPath(1, 5, new HashSet<>(), "");

	}

}
