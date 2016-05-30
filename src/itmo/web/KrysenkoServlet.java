package itmo.web;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class KrysenkoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		String var = req.getParameter("var");
		int task = Integer.parseInt(var);
		switch(task){
		case 0:
			resp.getWriter().println("Hello, world");
			break;
		case 1:
			String var1 = req.getParameter("var1");
			int i1 = Integer.parseInt(var1);
			String var2 = req.getParameter("var2");
			int i2 = Integer.parseInt(var2);
			String operation = req.getParameter("operation");
			int result;
			if(operation.equals("0")){
				result = i1 + i2;
				} else if(operation.equals("1")){
				result = i1 - i2;
				} else if (operation.equals("2")){
				result = i1 * i2;
				} else {
				result = i1 / i2;
				}
			resp.getWriter().println(result) ;
			break;
		case 2:
			byte b = 127;
			resp.getWriter().println(b);resp.getWriter().println("<br>");
			short s = 32767;
			resp.getWriter().println(s);resp.getWriter().println("<br>");
			int i = 999999999;
			resp.getWriter().println(i);resp.getWriter().println("<br>");
			long l = 100l;
			resp.getWriter().println(l);resp.getWriter().println("<br>");
			char c2 = 'c';
			char c3 = 1200;
			resp.getWriter().println(c2);resp.getWriter().println("<br>");
			resp.getWriter().println(c3);resp.getWriter().println("<br>");
			char c = 0x0770;
			resp.getWriter().println(c);
			resp.getWriter().println((int)c);resp.getWriter().println("<br>");
			int h=3,g=2;
			resp.getWriter().println(h/g);resp.getWriter().println("<br>");
			resp.getWriter().println((float)h/g);resp.getWriter().println("<br>");
			float h1=30000000000000000.0f,g1=2;
			resp.getWriter().println(h1/g1);resp.getWriter().println((int)(h1/g1));resp.getWriter().println("<br>");
			resp.getWriter().println();resp.getWriter().println("<br>");
			float f = 100000000000000000000000000000000000000.0f;
			resp.getWriter().println(f);resp.getWriter().println("<br>");
			double googol = 1e100;
			double d = 1100.34;
			boolean bool = true;
			resp.getWriter().println(googol);
			resp.getWriter().print("Line break"+"\n");resp.getWriter().println("<br>");
			int x=1,y=2,z,opertion=0;
			switch (opertion){
			case 0:
			z = x+y;
			break;
			case 1:
			z = x-y;
			break;
			case 2:
			z = x*y;
			break;
			default:
			z = x/y;
			}
			resp.getWriter().println("The result of the operation: "+z);resp.getWriter().println("<br>");
			long factorial=1;
			for (l=1l;l<10;l++){
			factorial*=l;
			}
			resp.getWriter().println(factorial);resp.getWriter().println("<br>");
			int[] m1;
			int[] m2 = new int[5];
			int[] m3 = {1,2,3};
			resp.getWriter().println(m3[0]);resp.getWriter().println("<br>");
			int[][] m4;
			int[][] m5 = {{1,2},{2}};
			resp.getWriter().println(m5[0][0]);resp.getWriter().println("<br>");
			String[] str = new String[4];
			String[] seasons = {"Winter","Spring","Summer","Autumn"};resp.getWriter().println("<br>");
			for(i=0;i<seasons.length;i++){
				resp.getWriter().println(seasons[i]);resp.getWriter().println("<br>");
			}double dd = Math.random();
			resp.getWriter().println(dd);resp.getWriter().println("<br>");
			int random = (int)(dd*100);
			resp.getWriter().println(random);resp.getWriter().println("<br>");
			break;
		case 3:
			String m = req.getParameter("m");
			double ex2_m = Double.parseDouble(m);
			String n = req.getParameter("n");
			double ex2_n = Double.parseDouble(n);
			double sr1;
			double sr2;
			sr1 = Math.abs(10-ex2_m);
			sr2 = Math.abs(10-ex2_n);
			if(sr1>sr2){
				resp.getWriter().println(n);
			}else{
				resp.getWriter().println(m);
			}
			break;
		case 4:
			String as = req.getParameter("a");
			double ex3_a = Double.parseDouble(as);
			String bs = req.getParameter("b");
			double ex3_b = Double.parseDouble(bs);
			String cs = req.getParameter("c");
			double ex3_c = Double.parseDouble(cs);
			double D = ex3_b*ex3_b-4*ex3_a*ex3_c;
			if(D > 0){
				resp.getWriter().println( (-ex3_b - Math.sqrt(D))/2);
				resp.getWriter().println( (-ex3_b + Math.sqrt(D))/2);
			}else if (D == 0){
				resp.getWriter().println( -(ex3_b/2*ex3_a));
			}else{
				resp.getWriter().println( "Êîðíåé íåò");
			}
			break;
		case 5:
			int n_arr = 8;
			int m_arr = 5;
			int[][] array1 = new int[n_arr][m_arr];
			for(int i_ex4 = 0; i_ex4 < n_arr; i_ex4++){ 
				for(int j_ex4 = 0; j_ex4 < m_arr; j_ex4++){
					array1[i_ex4][j_ex4] = ((int)(11+Math.random()*(100-11)));
					resp.getWriter().print(array1[i_ex4][j_ex4]+" | ");
				}
				resp.getWriter().println("<br>");
			}
			break;
		case 6:
			int n_arr2 = 5;
			int m_arr2 = 8;
			int[][] array2 = new int[n_arr2][m_arr2];
			for(int i_ex5 = 0; i_ex5 < n_arr2; i_ex5++){ 
				for(int j_ex5 = 0; j_ex5 < m_arr2; j_ex5++){
					array2[i_ex5][j_ex5] = ((int)(Math.random()*(200)-100));
					resp.getWriter().print(array2[i_ex5][j_ex5]+" | ");
				}
				resp.getWriter().println("<br>");
			}
			int max = 0;
			for(int i_ex5 = 0; i_ex5 < n_arr2; i_ex5++){
				for(int j_ex5 = 0; j_ex5 < m_arr2; j_ex5++){
					if(Math.abs(array2[i_ex5][j_ex5]) > Math.abs(max)){
						max = array2[i_ex5][j_ex5];
					}
				}
			}
			resp.getWriter().println("<br>"+max);
			break;
	}
	}
}
