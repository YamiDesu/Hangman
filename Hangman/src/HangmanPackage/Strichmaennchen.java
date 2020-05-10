package HangmanPackage;

public class Strichmaennchen {
	
	public static char[][] galgen = new char[25][11]; // 25 x 11 
	
	public static void drop() {
		System.out.println(galgen[0][0]);
	}
	
	public static void create() {
		for(int x=0 ; x < galgen.length ; x++ ) {
			for(int y=0 ; y < galgen[x].length ; y++ ) {
				galgen[x][y]=' ';
			}
		}
	}
	
	public static void draw(int fail) {
		
	
		if(fail==0||fail==1||fail==2||fail==3||fail==4||fail==5||fail==6||fail==7||fail==8||fail==9) {
			galgen[9][8] ='H';
			galgen[10][8]='A';
			galgen[11][8]='N';
			galgen[12][8]='G';
			galgen[13][8]='M';
			galgen[14][8]='A';
			galgen[15][8]='N';
			for(int y=6;y<=10;y=y+4) {
				for(int x=1;x<=23;x++) {
					galgen[x][y]='-';
				}
			}
			for(int x=0;x<=24;x=x+24) {
				for(int y=7;y<=9;y++) {
					galgen[x][y]='|';
				}
			}
			galgen[0][6]  ='+';
			galgen[0][10] ='+';
			galgen[24][6] ='+';
			galgen[24][10]='+';
		} 
		if (fail==0||fail==1||fail==2||fail==3||fail==4||fail==5||fail==6||fail==7||fail==8) {
			for(int i=0;i<=4;i++) {
				galgen[11][1+i]='|';
			}
			galgen[11][0]='+';
		} 
		if (fail==0||fail==1||fail==2||fail==3||fail==4||fail==5||fail==6||fail==7) {
			for(int i=0;i<=3;i++) {
				galgen[12+i][0]='-';
			}
			galgen[15][0]='+';
		} 
		if (fail==0||fail==1||fail==2||fail==3||fail==4||fail==5||fail==6) {
			galgen[15][1]='|';
		} 
		if (fail==0||fail==1||fail==2||fail==3||fail==4||fail==5) {
			galgen[15][2]='O';	
		} 
		if (fail==0||fail==1||fail==2||fail==3||fail==4) {
			galgen[15][3]='|';
		} 
		if (fail==0||fail==1||fail==2||fail==3) {
			galgen[14][3]='/';
		} 
		if (fail==0||fail==1||fail==2) {
			galgen[16][3]='\\';
		} 
		if (fail==0||fail==1) {
			galgen[14][4]='/';
		} 
		if (fail==0) {
			galgen[16][4]='\\';
		} 
		
		/*for(int x=0 ; x<galgen.length ; x++) {
			for(int y=0; y<galgen[x].length ; y++) {
				System.out.print(galgen[y][x]);
			}
			System.out.println(" ");
		}*/
		
		for(int y=0 ; y<galgen[y].length ; y++) {
			for(int x=0; x<galgen.length ; x++) {
				System.out.print(galgen[x][y]);
			}
			System.out.println(" ");
		}
	}
}
