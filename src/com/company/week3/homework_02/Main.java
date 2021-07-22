package com.company.week3.homework_02;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
xndir:
stexcum enq ProgressAware class; classi karox e carayi UI applicationnerum progress cuyc talu hamar;
qani vor UI chunenq kbavararvenq printnerov;
ProgressAware-n uni hetevyal methodner@:
 showProgress() //print e anum vor progress@ dardzav tesaneli
 hideProgress() //print e anum vor progress@ dardzav antesaneli
 isProgressVisible() // veradardznum e bool
 showProgress(int seconds) //%-nerov print e anum te method@ kanchelu pahic hashvac inchqan e ancel.
ProgressAware@ uni 2 direct child class: LineProgressAware ev CircleProgressAware
LineProgressAware@ uni mi hat avel property Line Length anunov;
constructorov talu enq et propertyin (ete sxal arjeq tvecin cragir@ stop enq anum)
 showProgress(int seconds) method@ poxum enq aynpes vor print ani "Line width is: %d, Progress length is %d";
 ete super classum tpum einq tokosner@, stex tpum enq te inch erkarutyuna ancel progressi gic@
 ete seconds@ 10 vayrkyan e u Line Width@ 500, 5rd vayrkyanin progress@ hasac klini 250
CircleProgressAware
 showProgress(int seconds) tpelu e te qani astichan e progress@ pttvel maximum 360astichanic;
 ete seconds@ 10 vayrkyan e, 5rd vayrkyanin progress@ hasac klini 180
LineProgressAware@ uni ImageLoader child; ImageLoadern uni url property. load() method,
vor@ 5 vayrkyanva @ntacqum loada anum image@ tvac url-ic;
uni method vor imananq image@ load exel e te che; ete arden load exel e, erkrord angam load() anel chenq toxnum;
load anelu @ntacqum progressi masin
printner@ chenq moranum
h.g
vayrkyannerov progress@ cuyc tal@ irakanacnum enq while-i mijocov

*/

//        ProgressAware progressAware = new ProgressAware();
//        progressAware.showProgress(100);

//        LineProgressAware lineProgressAware = new LineProgressAware(500);
//        lineProgressAware.showProgress(20);

//        CircleProgressAware circleProgressAware = new CircleProgressAware();
//        circleProgressAware.showProgress(10);

        ImageLoader imageLoader = new ImageLoader(200);
        imageLoader.load();
    }
}
