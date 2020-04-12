public class Q2007_4 {

    public static void main(String[] args){

        String phrase1= "cs at waterloo";
        String phrase2 = "coolaswetart";
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int dd = 0;
        int ee = 0;
        int ff = 0;
        int gg = 0;
        int hh = 0;
        int ii = 0;
        int jj = 0;
        int kk = 0;
        int ll = 0;
        int mm = 0;
        int nn = 0;
        int oo = 0;
        int pp = 0;
        int qq = 0;
        int rr = 0;
        int ss = 0;
        int tt = 0;
        int uu = 0;
        int vv = 0;
        int ww = 0;
        int xx = 0;
        int yy = 0;
        int zz = 0;

        int aaa = 0;
        int bbb = 0;
        int ccc = 0;
        int ddd = 0;
        int eee = 0;
        int fff = 0;
        int ggg = 0;
        int hhh = 0;
        int iii = 0;
        int jjj = 0;
        int kkk = 0;
        int lll = 0;
        int mmm = 0;
        int nnn = 0;
        int ooo = 0;
        int ppp = 0;
        int qqq = 0;
        int rrr = 0;
        int sss = 0;
        int ttt = 0;
        int uuu = 0;
        int vvv = 0;
        int www = 0;
        int xxx = 0;
        int yyy = 0;
        int zzz = 0;

        for (int i = 0; i < phrase1.length(); i++){
            switch (phrase1.charAt(i)) {
                case 'a':
                    aa++;
                    break;
                case 'b':
                    bb++;
                    break;
                case 'c':
                    cc++;
                    break;
                case 'd':
                    dd++;
                    break;
                case 'e':
                    ee++;
                    break;
                case 'f':
                    ff++;
                    break;
                case 'g':
                    gg++;
                    break;
                case 'h':
                    hh++;
                    break;
                case 'i':
                    ii++;
                    break;
                case 'j':
                    jj++;
                    break;
                case 'k':
                    kk++;
                    break;
                case 'l':
                    ll++;
                    break;
                case 'm':
                    mm++;
                    break;
                case 'n':
                    nn++;
                    break;
                case 'o':
                    oo++;
                    break;
                case 'p':
                    pp++;
                    break;
                case 'q':
                    qq++;
                    break;
                case 'r':
                    rr++;
                    break;
                case 's':
                    ss++;
                    break;
                case 't':
                    tt++;
                    break;
                case 'u':
                    uu++;
                    break;
                case 'v':
                    vv++;
                    break;
                case 'w':
                    ww++;
                    break;
                case 'x':
                    xx++;
                    break;
                case 'y':
                    yy++;
                    break;
                case 'z':
                    zz++;
                    break;

            }
        }


        for (int secondi = 0; secondi < phrase2.length(); secondi++){
            switch (phrase2.charAt(secondi)) {
                case 'a':
                    aaa++;
                    break;
                case 'b':
                    bbb++;
                    break;
                case 'c':
                    ccc++;
                    break;
                case 'd':
                    ddd++;
                    break;
                case 'e':
                    eee++;
                    break;
                case 'f':
                    fff++;
                    break;
                case 'g':
                    ggg++;
                    break;
                case 'h':
                    hhh++;
                    break;
                case 'i':
                    iii++;
                    break;
                case 'j':
                    jjj++;
                    break;
                case 'k':
                    kkk++;
                    break;
                case 'l':
                    lll++;
                    break;
                case 'm':
                    mmm++;
                    break;
                case 'n':
                    nnn++;
                    break;
                case 'o':
                    ooo++;
                    break;
                case 'p':
                    ppp++;
                    break;
                case 'q':
                    qqq++;
                    break;
                case 'r':
                    rrr++;
                    break;
                case 's':
                    sss++;
                    break;
                case 't':
                    ttt++;
                    break;
                case 'u':
                    uuu++;
                    break;
                case 'v':
                    vvv++;
                    break;
                case 'w':
                    www++;
                    break;
                case 'x':
                    xxx++;
                    break;
                case 'y':
                    yyy++;
                    break;
                case 'z':
                    zzz++;
                    break;

            }
        }

        if ((aa == aaa)&&(bb == bbb)&&(cc == ccc)&&(dd == ddd)&&(ee == eee)&&(ff == fff)&&(gg == ggg)&&(hh == hhh)&&(ii == iii)&&(jj == jjj)&&(kk == kkk)&&(ll == lll)&&(mm == mmm)&&(nn == nnn)&&(oo == ooo)&&(pp == ppp)&&(qq == qqq)&&(rr == rrr)&&(ss == sss)&&(tt == ttt)&&(uu == uuu)&&(vv == vvv)&&(ww == www)&&(xx == xxx)&&(yy == yyy)&&(zz == zzz)){
            System.out.println("Is an anagram");
        } else {
            System.out.println("Isn't an anagram");
        }



    }
}
