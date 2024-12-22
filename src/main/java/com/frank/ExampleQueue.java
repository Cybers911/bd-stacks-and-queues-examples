package com.frank;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> tasksStillToBeDone = new LinkedList<>();
        tasksStillToBeDone.add(3);
        tasksStillToBeDone.add(2);
        tasksStillToBeDone.add(5);
        tasksStillToBeDone.add(1);

        while (!tasksStillToBeDone.isEmpty()) {// mientras la cola no este vacia
            //preguntarle al primer empleado si ya finalizo su task
            /*if (tasksStillToBeDone.peek().equals(1)) {*/
         /*   tasksStillToBeDone.poll(); // sacar el primer elemento de la cola
                 // }
        } else { //Si no finalizo todavia su task, moverlo al final de la cola
                Integer oldValue = tasksStillToBeDone.poll();
                tasksStillToBeDone.offer(oldValue -1);
            }
            System.out.println(tasksStillToBeDone);
        }

            //Si ya finalizo su task, sacarlo de la cola*/

                //OTRA FORMA DE HACERLO
                //REMOVE THE FIRST PERSON BUT STORE THE NUMBER OF TASKS
                //IF THAT NUMBER IS GRATER THAN 1 PUT IN THE BACK WITH A SMALLER NUMBER
                int currentNumberTasksOfMostFrontPerson = tasksStillToBeDone.poll();//Guardar el
                // numero de tareas que tiene el primero


                if (currentNumberTasksOfMostFrontPerson > 1) {// si tiene mas de 1 tarea añadimos
                    // la tarea restante

                    tasksStillToBeDone.offer(currentNumberTasksOfMostFrontPerson - 1);// añadimos
                    // la tarea restante en la cola menos 1 para que la cola siga ordenada
                    // para que siga siendo una cola de prioridad


                }
                System.out.println(tasksStillToBeDone);


            }
        }
    }



// 3, 2, 5, 1 Uste primera en la fila ha terminado? No entonces valla a lo ultimo en la fila.
//la primera fue a lo ultimo y le reducimos one Task de 3  a 2.
// 2, 5, 1, 2
//Usted primera num 2 ha terminado no entonces vall al final y le reducimos 1 task de 2 a 1.
//5, 1, 2, 1
//Usted primera num 5 ha terminado no entonces vall al final y le reducimos 1 task de 5 a 4.
//1, 2, 1, 4
//En este caso la primer persona ya termino y la sacamos de los elementos de la cola.
//2, 1, 4 Usted primera num 2 ha terminado no entonces vall al final y le reducimos 1 task de 2 a 1.
//1, 4, 1
//4, 1
//1, 3
//3
//2
//1
