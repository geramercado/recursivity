package RecursividadGerardoMercado;

import TdaGerardoMercado.Alumno;

public class TdaAlumnoRecursivo {


    Alumno tdaAlumno[];
        int index;

        TdaAlumnoRecursivo(int size, int index){
            this.tdaAlumno = new Alumno[size];
            this.index = index;
        }

        TdaAlumnoRecursivo(){
            this.tdaAlumno = new Alumno[4];
            this.index = 0;
        }

        TdaAlumnoRecursivo(int index){}


        public boolean full(){

            return index == tdaAlumno.length;
        }


        public boolean empty(){

            return index == 0;
        }


        @Override
        public String toString(){

         return imprimir(0,"");
        }


        public String imprimir(int n, String impresion){
            if(n<index){
                impresion = impresion + tdaAlumno[n]+"\n";
                return imprimir(++n, impresion);
            }
         return impresion;

        }

        public void add(Alumno alumno){
            if(full()){
                System.out.println("El tda está lleno");
            }else{
                tdaAlumno[index] = alumno;
                index++;
            }

        }
            //busqueda secuencial por nombre: retorna lista index
       public String searchIndex(String cadena, int a, String bloque){

            if(a<index){
                if(cadena == tdaAlumno[a].getNombre()){
                    bloque += " |"+(a+1);
                }
                return searchIndex(cadena, ++a, bloque);
            }
            return bloque;
       }

        //busqueda secuencial por nombre: retorna contenido de coincidencia
        public String searchPupil(String name, int a, String pupil){
            if(a<index){
                if(name == tdaAlumno[a].getNombre()){
                    pupil += tdaAlumno[a]+"\n";
                }
                return searchPupil(name,++a,pupil);
            }
            return pupil;
        }

            //busqueda secuencial por nombre: retorna boleano
        public boolean comparacion(String nombre, int a){
            if(a < index){
                if(tdaAlumno[a].getNombre() == nombre){
                return true;
            }else{
                    return comparacion(nombre, a+1);
                }

             }
             return false;
         }

            //busqueda secuencial por letra inicial del nombre: retorna los nombres con la inicial
        public String busquedaSecuencialInicial(char a, int b, String cadena){
            if(b < index){
                if(a == tdaAlumno[b].getNombre().charAt(0)){
                cadena += tdaAlumno[b].getNombre()+" |";
                }
                return busquedaSecuencialInicial(a,++b, cadena);


            }
                return cadena;
        }

        //editar uno
      public void editarUno(String nombre, Alumno alumno, int a){
        if(a < index){
            if(nombre == tdaAlumno[a].getNombre()){
                tdaAlumno[a] = alumno;
                 a = index;
            }
            editarUno(nombre, alumno, ++a);
        }
      }

        //editar todos
      public void editarTodos(Alumno alumno, int a){
        if(a < index){
            tdaAlumno[a] = alumno;
            editarTodos(alumno, ++a);
        }
      }


            //promedio de la edad
        public double promedioPorEdad(int a, double suma){
            if(a < index){
                suma += tdaAlumno[a].getEdad();
                return promedioPorEdad(++a,suma);
            }
            return suma/index;
        }

            //maximo (edad)
        public String elMayor(int auxiliar, int a, String mayor){
            if(a < index){
                if(auxiliar < tdaAlumno[a].getEdad()){
                    auxiliar = tdaAlumno[a].getEdad();
                    mayor = tdaAlumno[a].getNombre();
                }
                    return elMayor(auxiliar,++a, mayor);

            }
            return mayor;
        }


        /*
        //ordenar ascendente (edad)
        //ordenar descendente (edad)
        //ordenar ascendente (longitud del nombre)
        //ordenar descendente (longitud del nombre)
        //rellenar los vacios
        //minimo (edad)
        */

}
