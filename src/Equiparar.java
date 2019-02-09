public class Equiparar implements Comparable<Comparar>{
    int n1;

    Equiparar (int i){this.n1 = i;}

    public int compareTo(Comparar n){
        if(this.n1 > n.n1){
            return 1;
        }
        else if (this.n1 < n.n1){
            return -1;
        }
        else{
            return 0;
        }
    }
}
