package generator.compass;

public class DeclinationTable2013 {

    //
    // Pop in IGRF declination table values for 2013. This gives us a
    // "good enough" value for declination for the simulation. Values are
    // stored for every 10 degrees and we take the one that's close enough
    // when we return a result.
    //
    public static final double[][] declination_table = {
            {80, -180, 5.84566},
            {80, -170, 11.89447},
            {80, -160, 17.67551},
            {80, -150, 22.66466},
            {80, -140, 25.9251},
            {80, -130, 25.29135},
            {80, -120, 14.83508},
            {80, -110, -16.06057},
            {80, -100, -47.57007},
            {80, -90, -58.37613},
            {80, -80, -58.90307},
            {80, -70, -55.27729},
            {80, -60, -49.7103},
            {80, -50, -43.11064},
            {80, -40, -35.91437},
            {80, -30, -28.36089},
            {80, -20, -20.59892},
            {80, -10, -12.73316},
            {80, 0, -4.84742},
            {80, 10, 2.98189},
            {80, 20, 10.67523},
            {80, 30, 18.13808},
            {80, 40, 25.24393},
            {80, 50, 31.80621},
            {80, 60, 37.52743},
            {80, 70, 41.89914},
            {80, 80, 43.99856},
            {80, 90, 42.11791},
            {80, 100, 33.56063},
            {80, 110, 17.3085},
            {80, 120, 0.50705},
            {80, 130, -8.87387},
            {80, 140, -11.26829},
            {80, 150, -9.47512},
            {80, 160, -5.38363},
            {80, 170, -0.06319},
            {80, 180, 5.84566},
            {70, -180, 4.10214},
            {70, -170, 9.9663},
            {70, -160, 15.44309},
            {70, -150, 20.19486},
            {70, -140, 23.72252},
            {70, -130, 25.16915},
            {70, -120, 22.95008},
            {70, -110, 14.34894},
            {70, -100, -2.62088},
            {70, -90, -21.8204},
            {70, -80, -33.63478},
            {70, -70, -37.62803},
            {70, -60, -36.86416},
            {70, -50, -33.46967},
            {70, -40, -28.6017},
            {70, -30, -22.89672},
            {70, -20, -16.73347},
            {70, -10, -10.36467},
            {70, 0, -3.97703},
            {70, 10, 2.28674},
            {70, 20, 8.31334},
            {70, 30, 13.986},
            {70, 40, 19.12772},
            {70, 50, 23.43324},
            {70, 60, 26.39534},
            {70, 70, 27.21046},
            {70, 80, 24.6896},
            {70, 90, 17.52406},
            {70, 100, 5.93071},
            {70, 110, -6.17951},
            {70, 120, -14.16925},
            {70, 130, -17.02932},
            {70, 140, -16.00795},
            {70, 150, -12.50523},
            {70, 160, -7.55119},
            {70, 170, -1.85338},
            {70, 180, 4.10214},
            {60, -180, 3.81147},
            {60, -170, 8.99017},
            {60, -160, 13.70841},
            {60, -150, 17.64329},
            {60, -140, 20.363},
            {60, -130, 21.28646},
            {60, -120, 19.60486},
            {60, -110, 14.23326},
            {60, -100, 4.40987},
            {60, -90, -8.21863},
            {60, -80, -19.05151},
            {60, -70, -25.0271},
            {60, -60, -26.48128},
            {60, -50, -24.8883},
            {60, -40, -21.4883},
            {60, -30, -17.09604},
            {60, -20, -12.2242},
            {60, -10, -7.2298},
            {60, 0, -2.39239},
            {60, 10, 2.1036},
            {60, 20, 6.20326},
            {60, 30, 9.91673},
            {60, 40, 13.16466},
            {60, 50, 15.66342},
            {60, 60, 16.93021},
            {60, 70, 16.36833},
            {60, 80, 13.40044},
            {60, 90, 7.77112},
            {60, 100, 0.15851},
            {60, 110, -7.47674},
            {60, 120, -12.90934},
            {60, 130, -15.10024},
            {60, 140, -14.27346},
            {60, 150, -11.2023},
            {60, 160, -6.72298},
            {60, 170, -1.54459},
            {60, 180, 3.81147},
            {50, -180, 4.12469},
            {50, -170, 8.55805},
            {50, -160, 12.46656},
            {50, -150, 15.57267},
            {50, -140, 17.53137},
            {50, -130, 17.97249},
            {50, -120, 16.49058},
            {50, -110, 12.55215},
            {50, -100, 5.68321},
            {50, -90, -3.5025},
            {50, -80, -12.41619},
            {50, -70, -18.26569},
            {50, -60, -20.30752},
            {50, -50, -19.36861},
            {50, -40, -16.59481},
            {50, -30, -12.87846},
            {50, -20, -8.7794},
            {50, -10, -4.69192},
            {50, 0, -0.98086},
            {50, 10, 2.12701},
            {50, 20, 4.68146},
            {50, 30, 6.84843},
            {50, 40, 8.62116},
            {50, 50, 9.77842},
            {50, 60, 10.04568},
            {50, 70, 9.1948},
            {50, 80, 7.04684},
            {50, 90, 3.52067},
            {50, 100, -1.16138},
            {50, 110, -6.1811},
            {50, 120, -10.20748},
            {50, 130, -12.12283},
            {50, 140, -11.61836},
            {50, 150, -9.07404},
            {50, 160, -5.16163},
            {50, 170, -0.57397},
            {50, 180, 4.12469},
            {40, -180, 5.21564},
            {40, -170, 8.6606},
            {40, -160, 11.49209},
            {40, -150, 13.66905},
            {40, -140, 15.01223},
            {40, -130, 15.23888},
            {40, -120, 14.04225},
            {40, -110, 11.02223},
            {40, -100, 5.75009},
            {40, -90, -1.54171},
            {40, -80, -9.1497},
            {40, -70, -14.71922},
            {40, -60, -17.08382},
            {40, -50, -16.56848},
            {40, -40, -14.15935},
            {40, -30, -10.7924},
            {40, -20, -7.0566},
            {40, -10, -3.38561},
            {40, 0, -0.27517},
            {40, 10, 2.01093},
            {40, 20, 3.68027},
            {40, 30, 4.95897},
            {40, 40, 5.71383},
            {40, 50, 5.79899},
            {40, 60, 5.36168},
            {40, 70, 4.55764},
            {40, 80, 3.29286},
            {40, 90, 1.35689},
            {40, 100, -1.36542},
            {40, 110, -4.62345},
            {40, 120, -7.54326},
            {40, 130, -9.01993},
            {40, 140, -8.52373},
            {40, 150, -6.25579},
            {40, 160, -2.76951},
            {40, 170, 1.26919},
            {40, 180, 5.21564},
            {30, -180, 6.75649},
            {30, -170, 8.92351},
            {30, -160, 10.46589},
            {30, -150, 11.73188},
            {30, -140, 12.64296},
            {30, -130, 12.81547},
            {30, -120, 11.91139},
            {30, -110, 9.60175},
            {30, -100, 5.48259},
            {30, -90, -0.45388},
            {30, -80, -7.1263},
            {30, -70, -12.65205},
            {30, -60, -15.63459},
            {30, -50, -15.82028},
            {30, -40, -13.83592},
            {30, -30, -10.62022},
            {30, -20, -6.89806},
            {30, -10, -3.25742},
            {30, 0, -0.36885},
            {30, 10, 1.54746},
            {30, 20, 2.92688},
            {30, 30, 3.91185},
            {30, 40, 4.05247},
            {30, 50, 3.30949},
            {30, 60, 2.35674},
            {30, 70, 1.63193},
            {30, 80, 0.9672},
            {30, 90, 0.08647},
            {30, 100, -1.23347},
            {30, 110, -3.10994},
            {30, 120, -5.02795},
            {30, 130, -5.91573},
            {30, 140, -5.16037},
            {30, 150, -2.94239},
            {30, 160, 0.24256},
            {30, 170, 3.73263},
            {30, 180, 6.75649},
            {20, -180, 8.08456},
            {20, -170, 8.98716},
            {20, -160, 9.43715},
            {20, -150, 10.02254},
            {20, -140, 10.59505},
            {20, -130, 10.67516},
            {20, -120, 10.04252},
            {20, -110, 8.47501},
            {20, -100, 5.45403},
            {20, -90, 0.64368},
            {20, -80, -5.40296},
            {20, -70, -11.21055},
            {20, -60, -15.22481},
            {20, -50, -16.5446},
            {20, -40, -15.18794},
            {20, -30, -11.99673},
            {20, -20, -8.00061},
            {20, -10, -4.12085},
            {20, 0, -1.19372},
            {20, 10, 0.70751},
            {20, 20, 2.21799},
            {20, 30, 3.26551},
            {20, 40, 3.07195},
            {20, 50, 1.76373},
            {20, 60, 0.45445},
            {20, 70, -0.2686},
            {20, 80, -0.61113},
            {20, 90, -0.75959},
            {20, 100, -0.95552},
            {20, 110, -1.67682},
            {20, 120, -2.7139},
            {20, 130, -2.9725},
            {20, 140, -1.83789},
            {20, 150, 0.40054},
            {20, 160, 3.26644},
            {20, 170, 6.1054},
            {20, 180, 8.08456},
            {10, -180, 8.84303},
            {10, -170, 8.92874},
            {10, -160, 8.83194},
            {10, -150, 9.06899},
            {10, -140, 9.36758},
            {10, -130, 9.30334},
            {10, -120, 8.91046},
            {10, -110, 8.06296},
            {10, -100, 6.02429},
            {10, -90, 2.0803},
            {10, -80, -3.66864},
            {10, -70, -10.01889},
            {10, -60, -15.2663},
            {10, -50, -18.01232},
            {10, -40, -17.62456},
            {10, -30, -14.62284},
            {10, -20, -10.30688},
            {10, -10, -6.0335},
            {10, 0, -2.78367},
            {10, 10, -0.5086},
            {10, 20, 1.41198},
            {10, 30, 2.59318},
            {10, 40, 2.09948},
            {10, 50, 0.34792},
            {10, 60, -1.2251},
            {10, 70, -1.95712},
            {10, 80, -1.99842},
            {10, 90, -1.41112},
            {10, 100, -0.56173},
            {10, 110, -0.34349},
            {10, 120, -0.7252},
            {10, 130, -0.46128},
            {10, 140, 1.01655},
            {10, 150, 3.21937},
            {10, 160, 5.67198},
            {10, 170, 7.78203},
            {10, 180, 8.84303},
            {0, -180, 9.44306},
            {0, -170, 9.30881},
            {0, -160, 9.17015},
            {0, -150, 9.32495},
            {0, -140, 9.45961},
            {0, -130, 9.26604},
            {0, -120, 8.9591},
            {0, -110, 8.5314},
            {0, -100, 7.16867},
            {0, -90, 3.84185},
            {0, -80, -1.81919},
            {0, -70, -8.83128},
            {0, -60, -15.26606},
            {0, -50, -19.45119},
            {0, -40, -20.42142},
            {0, -30, -18.25135},
            {0, -20, -14.12641},
            {0, -10, -9.57276},
            {0, 0, -5.63834},
            {0, 10, -2.4415},
            {0, 20, 0.15294},
            {0, 30, 1.32601},
            {0, 40, 0.27436},
            {0, 50, -2.03349},
            {0, 60, -3.82117},
            {0, 70, -4.39333},
            {0, 80, -3.86687},
            {0, 90, -2.29087},
            {0, 100, -0.32024},
            {0, 110, 0.7184},
            {0, 120, 0.81436},
            {0, 130, 1.43466},
            {0, 140, 3.11848},
            {0, 150, 5.23213},
            {0, 160, 7.3155},
            {0, 170, 8.87651},
            {0, 180, 9.44306},
            {-10, -180, 10.61755},
            {-10, -170, 10.64968},
            {-10, -160, 10.70881},
            {-10, -150, 10.90264},
            {-10, -140, 10.95363},
            {-10, -130, 10.65515},
            {-10, -120, 10.25972},
            {-10, -110, 9.8964},
            {-10, -100, 8.89406},
            {-10, -90, 6.03645},
            {-10, -80, 0.46054},
            {-10, -70, -7.17564},
            {-10, -60, -14.7299},
            {-10, -50, -20.24029},
            {-10, -40, -22.74699},
            {-10, -30, -22.21945},
            {-10, -20, -19.44421},
            {-10, -10, -15.3469},
            {-10, 0, -10.61297},
            {-10, 10, -5.99233},
            {-10, 20, -2.62225},
            {-10, 30, -1.93651},
            {-10, 40, -4.09088},
            {-10, 50, -7.09808},
            {-10, 60, -8.82678},
            {-10, 70, -8.75151},
            {-10, 80, -7.15518},
            {-10, 90, -4.21729},
            {-10, 100, -0.92367},
            {-10, 110, 1.06197},
            {-10, 120, 1.75392},
            {-10, 130, 2.74602},
            {-10, 140, 4.60805},
            {-10, 150, 6.74084},
            {-10, 160, 8.71254},
            {-10, 170, 10.09802},
            {-10, 180, 10.61755},
            {-20, -180, 12.86407},
            {-20, -170, 13.17427},
            {-20, -160, 13.43557},
            {-20, -150, 13.64988},
            {-20, -140, 13.61182},
            {-20, -130, 13.24444},
            {-20, -120, 12.80104},
            {-20, -110, 12.45015},
            {-20, -100, 11.65106},
            {-20, -90, 9.12651},
            {-20, -80, 3.69671},
            {-20, -70, -4.36694},
            {-20, -60, -12.95121},
            {-20, -50, -19.70719},
            {-20, -40, -23.59814},
            {-20, -30, -24.88825},
            {-20, -20, -24.31494},
            {-20, -10, -21.96995},
            {-20, 0, -17.59593},
            {-20, 10, -12.4354},
            {-20, 20, -9.40918},
            {-20, 30, -10.35745},
            {-20, 40, -13.9389},
            {-20, 50, -17.14401},
            {-20, 60, -18.056},
            {-20, 70, -16.59347},
            {-20, 80, -13.2888},
            {-20, 90, -8.5032},
            {-20, 100, -3.46237},
            {-20, 110, -0.00539},
            {-20, 120, 1.85638},
            {-20, 130, 3.63612},
            {-20, 140, 5.95836},
            {-20, 150, 8.40771},
            {-20, 160, 10.59288},
            {-20, 170, 12.13001},
            {-20, 180, 12.86407},
            {-30, -180, 16.5022},
            {-30, -170, 17.02446},
            {-30, -160, 17.33447},
            {-30, -150, 17.44754},
            {-30, -140, 17.2996},
            {-30, -130, 16.99464},
            {-30, -120, 16.7795},
            {-30, -110, 16.66288},
            {-30, -100, 16.00569},
            {-30, -90, 13.56343},
            {-30, -80, 8.20395},
            {-30, -70, 0.00295},
            {-30, -60, -9.22746},
            {-30, -50, -17.00712},
            {-30, -40, -22.00754},
            {-30, -30, -24.54355},
            {-30, -20, -25.52989},
            {-30, -10, -25.0981},
            {-30, 0, -22.95349},
            {-30, 10, -20.58691},
            {-30, 20, -20.95144},
            {-30, 30, -24.48534},
            {-30, 40, -28.79989},
            {-30, 50, -31.56588},
            {-30, 60, -31.68097},
            {-30, 70, -29.07988},
            {-30, 80, -24.10425},
            {-30, 90, -17.16427},
            {-30, 100, -9.63514},
            {-30, 110, -3.57861},
            {-30, 120, 0.63272},
            {-30, 130, 4.14974},
            {-30, 140, 7.60854},
            {-30, 150, 10.84033},
            {-30, 160, 13.55569},
            {-30, 170, 15.46065},
            {-30, 180, 16.5022},
            {-40, -180, 21.93228},
            {-40, -170, 22.4797},
            {-40, -160, 22.63251},
            {-40, -150, 22.55537},
            {-40, -140, 22.38242},
            {-40, -130, 22.32094},
            {-40, -120, 22.47636},
            {-40, -110, 22.54425},
            {-40, -100, 21.71055},
            {-40, -90, 18.92924},
            {-40, -80, 13.47257},
            {-40, -70, 5.53633},
            {-40, -60, -3.45919},
            {-40, -50, -11.45911},
            {-40, -40, -17.08391},
            {-40, -30, -20.31049},
            {-40, -20, -21.92577},
            {-40, -10, -22.63332},
            {-40, 0, -23.21495},
            {-40, 10, -25.19159},
            {-40, 20, -29.53622},
            {-40, 30, -35.22079},
            {-40, 40, -40.47367},
            {-40, 50, -44.09743},
            {-40, 60, -45.44037},
            {-40, 70, -44.11617},
            {-40, 80, -39.80317},
            {-40, 90, -32.25744},
            {-40, 100, -22.21859},
            {-40, 110, -11.96062},
            {-40, 120, -3.24226},
            {-40, 130, 3.90447},
            {-40, 140, 9.84474},
            {-40, 150, 14.64561},
            {-40, 160, 18.264},
            {-40, 170, 20.64983},
            {-40, 180, 21.93228},
            {-50, -180, 30.32998},
            {-50, -170, 30.59055},
            {-50, -160, 30.4153},
            {-50, -150, 30.12363},
            {-50, -140, 29.9226},
            {-50, -130, 29.89607},
            {-50, -120, 29.86813},
            {-50, -110, 29.32161},
            {-50, -100, 27.55206},
            {-50, -90, 23.97482},
            {-50, -80, 18.40094},
            {-50, -70, 11.22435},
            {-50, -60, 3.44672},
            {-50, -50, -3.64857},
            {-50, -40, -9.12294},
            {-50, -30, -12.84154},
            {-50, -20, -15.41953},
            {-50, -10, -17.84583},
            {-50, 0, -21.16571},
            {-50, 10, -26.1025},
            {-50, 20, -32.52821},
            {-50, 30, -39.51321},
            {-50, 40, -46.0275},
            {-50, 50, -51.38392},
            {-50, 60, -55.17676},
            {-50, 70, -57.07228},
            {-50, 80, -56.59315},
            {-50, 90, -52.88959},
            {-50, 100, -44.7498},
            {-50, 110, -31.49367},
            {-50, 120, -14.85885},
            {-50, 130, 1.02802},
            {-50, 140, 13.20543},
            {-50, 150, 21.38116},
            {-50, 160, 26.40533},
            {-50, 170, 29.14595},
            {-50, 180, 30.32998},
            {-60, -180, 46.70841},
            {-60, -170, 45.57387},
            {-60, -160, 44.26946},
            {-60, -150, 43.01235},
            {-60, -140, 41.83321},
            {-60, -130, 40.59247},
            {-60, -120, 38.99506},
            {-60, -110, 36.66669},
            {-60, -100, 33.28942},
            {-60, -90, 28.72578},
            {-60, -80, 23.0848},
            {-60, -70, 16.72977},
            {-60, -60, 10.21405},
            {-60, -50, 4.1166},
            {-60, -40, -1.19214},
            {-60, -30, -5.73318},
            {-60, -20, -9.92462},
            {-60, -10, -14.3921},
            {-60, 0, -19.68676},
            {-60, 10, -26.0395},
            {-60, 20, -33.26471},
            {-60, 30, -40.88097},
            {-60, 40, -48.35851},
            {-60, 50, -55.3009},
            {-60, 60, -61.4778},
            {-60, 70, -66.76157},
            {-60, 80, -71.028},
            {-60, 90, -74.02547},
            {-60, 100, -75.14204},
            {-60, 110, -72.74346},
            {-60, 120, -61.53014},
            {-60, 130, -24.64977},
            {-60, 140, 22.94142},
            {-60, 150, 40.711},
            {-60, 160, 46.0269},
            {-60, 170, 47.19225},
            {-60, 180, 46.70841},
            {-70, -180, 85.37702},
            {-70, -170, 77.46655},
            {-70, -160, 71.16845},
            {-70, -150, 65.81107},
            {-70, -140, 60.96249},
            {-70, -130, 56.29653},
            {-70, -120, 51.5531},
            {-70, -110, 46.54015},
            {-70, -100, 41.14901},
            {-70, -90, 35.36534},
            {-70, -80, 29.26581},
            {-70, -70, 22.99625},
            {-70, -60, 16.72956},
            {-70, -50, 10.60705},
            {-70, -40, 4.67912},
            {-70, -30, -1.12815},
            {-70, -20, -6.99728},
            {-70, -10, -13.15451},
            {-70, 0, -19.78353},
            {-70, 10, -26.95812},
            {-70, 20, -34.62304},
            {-70, 30, -42.62748},
            {-70, 40, -50.78957},
            {-70, 50, -58.95965},
            {-70, 60, -67.06006},
            {-70, 70, -75.10101},
            {-70, 80, -83.18776},
            {-70, 90, -91.5419},
            {-70, 100, -100.57094},
            {-70, 110, -111.05781},
            {-70, 120, -124.66342},
            {-70, 130, -145.15806},
            {-70, 140, -178.77316},
            {-70, 150, 140.70475},
            {-70, 160, 112.6885},
            {-70, 170, 96.17595},
            {-70, 180, 85.37702},
            {-80, -180, 130.6841},
            {-80, -170, 118.26279},
            {-80, -160, 106.9858},
            {-80, -150, 96.7024},
            {-80, -140, 87.22027},
            {-80, -130, 78.35005},
            {-80, -120, 69.92704},
            {-80, -110, 61.81932},
            {-80, -100, 53.92883},
            {-80, -90, 46.188},
            {-80, -80, 38.55338},
            {-80, -70, 30.99701},
            {-80, -60, 23.49684},
            {-80, -50, 16.02769},
            {-80, -40, 8.55507},
            {-80, -30, 1.03354},
            {-80, -20, -6.58976},
            {-80, -10, -14.3677},
            {-80, 0, -22.34468},
            {-80, 10, -30.55032},
            {-80, 20, -38.99797},
            {-80, 30, -47.68863},
            {-80, 40, -56.61931},
            {-80, 50, -65.79339},
            {-80, 60, -75.2308},
            {-80, 70, -84.97637},
            {-80, 80, -95.10549},
            {-80, 90, -105.72626},
            {-80, 100, -116.97602},
            {-80, 110, -129.00712},
            {-80, 120, -141.95275},
            {-80, 130, -155.86372},
            {-80, 140, -170.62258},
            {-80, 150, 174.11859},
            {-80, 160, 158.89894},
            {-80, 170, 144.28501},
            {-80, 180, 130.6841},
            {-90, -180, 150.31365},
            {-90, -170, 140.31341},
            {-90, -160, 130.31322},
            {-90, -150, 120.31308},
            {-90, -140, 110.31298},
            {-90, -130, 100.31295},
            {-90, -120, 90.31296},
            {-90, -110, 80.31304},
            {-90, -100, 70.31317},
            {-90, -90, 60.31334},
            {-90, -80, 50.31356},
            {-90, -70, 40.31382},
            {-90, -60, 30.31411},
            {-90, -50, 20.31442},
            {-90, -40, 10.31474},
            {-90, -30, 0.31506},
            {-90, -20, -9.68463},
            {-90, -10, -19.68434},
            {-90, 0, -29.68407},
            {-90, 10, -39.68383},
            {-90, 20, -49.68364},
            {-90, 30, -59.6835},
            {-90, 40, -69.6834},
            {-90, 50, -79.68337},
            {-90, 60, -89.68339},
            {-90, 70, -99.68346},
            {-90, 80, -109.68359},
            {-90, 90, -119.68376},
            {-90, 100, -129.68398},
            {-90, 110, -139.68424},
            {-90, 120, -149.68453},
            {-90, 130, -159.68484},
            {-90, 140, -169.68516},
            {-90, 150, -179.68548},
            {-90, 160, 170.31421},
            {-90, 170, 160.31392},
            {-90, 180, 150.31365}
    };


    public static double getDeclination(double lat, double lon) {
        double lat_srch = Math.floor(lat);
        double lon_srch = Math.floor(lon);
        for (double[] d : declination_table) {
            if (d[0] == lat_srch && d[1] == lon_srch) {
                return d[2];
            }
        }

        return 1.0;
    }
}
