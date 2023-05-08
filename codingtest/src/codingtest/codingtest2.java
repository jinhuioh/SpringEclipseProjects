package codingtest;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.management.Query;
import javax.swing.JPopupMenu.Separator;
//class Connection{
//	private static Connection _inst = null;
//	private int count = 0;
//	static public Connection get() {
//		if(_inst == null) {
//			_inst = new Connection();
//			return _inst;
//		}
//		return _inst;
//	}
//	public void count() {count ++;}
//	public int getCount() {return count;}
//}
public class codingtest2 {
	public static void main(String[] args){
		Connection conn1 = Connection.get();
		conn1.count();
		Connection conn2 = Connection.get();
		conn2.count();
		Connection conn3 = Connection.get();
		conn3.count();
		System.out.println(conn1.getCount());
	}
}