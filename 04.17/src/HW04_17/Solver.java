/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_17;

public class Solver {

	public static void main(String[] args) {
		Calculate cal = new Calculate();

		double volume = 0.0;
		int ch = cal.get_int_val();
		if (ch == 1) {
			int a = cal.get_int_val();
			volume = Calculate.do_calc().get_volume(a);
		} else if (ch == 2) {
			int l = cal.get_int_val();
			int b = cal.get_int_val();
			int h = cal.get_int_val();
			volume = Calculate.do_calc().get_volume(l, b, h);
		} else if (ch == 3) {
			double r = cal.get_double_val();
			volume = Calculate.do_calc().get_volume(r);
		} else if (ch == 4) {
			double r = cal.get_double_val();
			double h = cal.get_double_val();
			volume = Calculate.do_calc().get_volume(r, h);
		}
		cal.output.display(volume);
	}
}
