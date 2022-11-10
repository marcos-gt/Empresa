class Aluno {
   int numeroLista;
   String nome;
   double nota1,nota2,nota3;
   double media;
   void inserirRegistro(int numLista,String n,double n1,double n2, double n3){
       numeroLista = numLista;
       nome = n;
       nota1 = n1;
       nota2 = n2;
       nota3 = n3;
   }
   double Media (double n1,double n2,double n3){
       return (n1+n2+n3)/3;
   }
   void exibirInfo(){
       System.out.println("Codigo do aluno: "+numeroLista + ", \nseu nome:  " + nome);
       System.out.println("Suas notas são: "+nota1+", "+nota2+", "+nota3+", " );
       System.out.println("Sua média ficou: "+Media(nota1,nota2,nota3) );
   }
   public static class Main {
       public static void main(String[] args){
           Aluno a1 = new Aluno();
           Aluno a2 = new Aluno();
           Aluno a3 = new Aluno();
           a1.inserirRegistro(101,"Marcos", 7.20,8.30,9);
           a2.inserirRegistro(102,"Mateus", 7.2,5.4, 6);
           a1.exibirInfo();
           a2.exibirInfo();
       }
   }
}