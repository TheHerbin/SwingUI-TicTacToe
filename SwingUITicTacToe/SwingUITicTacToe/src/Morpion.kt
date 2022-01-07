private var scorej1 : Int = 0
private var scorej2 : Int = 0

class Morpion {
    var tableau = Array(3) { arrayOfNulls<String>(3) }
    private var tour = 0
    private var x : Int = 0
    private var y : Int = 0
    private var symbol : String = ""


    constructor() {
        initialisergrille();
    }


    fun affichertab(){
        for (cy in 0..this.tableau.size){
            for (cx in 0..this.tableau.size){
                println()
            }
            println(" ")
        }
    }

    fun initialisergrille(){
        for (cy in 0..this.tableau.size-1){
            for (cx in 0..this.tableau.size-1)
            {
                this.tableau[cx][cy] = " "
            }
        }
    }

    fun determinejoueur(): Int{
        var joueur = this.tour % 2
        joueur+=1
        return joueur
    }

    fun testfin(): Boolean{

        if(     (tableau[0][0]== tableau[1][0]&&tableau[0][0]==tableau[2][0]&&tableau[0][0]!=" ")
            ||(tableau[0][1]==tableau[1][1]&&tableau[2][1]==tableau[0][1]&&tableau[0][1]!=" ")
            ||(tableau[0][2]==tableau[1][2]&&tableau[2][2]==tableau[0][2]&&tableau[0][2]!=" ")
            ||(tableau[0][0]== tableau[0][1]&&tableau[0][0]==tableau[0][2]&&tableau[0][0]!=" ")
            ||(tableau[1][0]==tableau[1][1]&&tableau[1][2]==tableau[1][0]&&tableau[1][0]!=" ")
            ||(tableau[2][0]==tableau[2][1]&&tableau[2][2]==tableau[2][0]&&tableau[2][0]!=" ")
            ||(tableau[0][0]== tableau[1][1]&&tableau[0][0]==tableau[2][2]&&tableau[0][0]!=" ")
            ||(tableau[0][2]== tableau[1][1]&&tableau[0][2]==tableau[2][0]&&tableau[0][2]!=" ")
        ){
            if(determinejoueur()==1){
                scorej1++
            }else{
                scorej2++
            }
            return true
        }
        return false
    }

    fun retournegagnant(): String{
        if (    (tableau[0][0]== tableau[1][0]&&tableau[0][0]==tableau[2][0]&&tableau[0][0]!=" ")
            ||(tableau[0][1]==tableau[1][1]&&tableau[2][1]==tableau[0][1]&&tableau[0][1]!=" ")
            ||(tableau[0][2]==tableau[1][2]&&tableau[2][2]==tableau[0][2]&&tableau[0][2]!=" ")
            ||(tableau[0][0]== tableau[0][1]&&tableau[0][0]==tableau[0][2]&&tableau[0][0]!=" ")
            ||(tableau[1][0]==tableau[1][1]&&tableau[1][2]==tableau[1][0]&&tableau[1][0]!=" ")
            ||(tableau[2][0]==tableau[2][1]&&tableau[2][2]==tableau[2][0]&&tableau[2][0]!=" ")
            ||(tableau[0][0]== tableau[1][1]&&tableau[0][0]==tableau[2][2]&&tableau[0][0]!=" ")
            ||(tableau[0][2]== tableau[1][1]&&tableau[0][2]==tableau[2][0]&&tableau[0][2]!=" ")
        ){

            return("Le joueur ${determinejoueur()} a gagné !")

        }
        return(" ")
    }

    fun choixjoueur(): String{
        return("C'est au joueur ${determinejoueur()} de jouer !")
    }

    fun testcaseP(): Boolean{
        if (tableau[x][y] != " "){
            return false
        }else{
            return true
        }
    }

    fun casePrise(): String{
        return("Cette case n'est pas vide ...")
    }

    fun casepPrise(): String{
        return("Cette case a été remplie ")
    }

    fun getX(): Int{return x}

    fun setX(x:Int){this.x = x}


    fun getY(): Int{return y}

    fun setY(y:Int){this.y = y}

    fun getSymbol(): String{
        if(determinejoueur()==1){
            symbol = "X"
        }else{
            symbol = "O"
        }
        return symbol
    }

    fun setSymbol(symbol:String){this.symbol = symbol}

    @JvmName("setTableau1")
    fun setTableau(tableau:Array<Array<String?>>){this.tableau = tableau}

    fun setCaseTableau(x: Int,y: Int,value: String){
        this.tableau[x][y] = value
    }

    fun getTour(): Int {return tour}

    fun setTour(tour:Int){this.tour = tour}
    fun getScorej1(): Int {return scorej1}
    fun getScorej2(): Int {return scorej2}


}