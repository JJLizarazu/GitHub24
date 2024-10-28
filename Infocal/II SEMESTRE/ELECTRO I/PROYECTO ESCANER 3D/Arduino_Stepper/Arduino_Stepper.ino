#include <Stepper.h>

int SPR = 2048;  // Pasos por revolución (steps per revolution)
int ms = 8;     // Velocidad del motor (RPM)
int s = 20;      // Cantidad de pasos por ciclo
int time = 1000; // Delay entre pasos (en milisegundos)
int giro_completo = SPR; // Pasos necesarios para un giro completo

Stepper motor(SPR, 5, 4, 3, 2); 

void setup() {
  motor.setSpeed(ms);
  Serial.begin(9600);
  Serial.println("Moviendo a la posición inicial 0...");
  motor.step(-giro_completo);
}

void loop() {
  motor.setSpeed(ms);
  
  for (int i = 0; i < giro_completo / s; i++) {
    motor.step(s);
    delay(time);
  }
  
  delay(10000);
}
