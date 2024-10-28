import cv2
import time
import os
from datetime import datetime


def captureImages(interval, totalImages):

    timestamp = datetime.now().strftime("%Y-%m-%d_%H-%M-%S")
    save_directory = f"captured_images{timestamp}"

    if not os.path.exists(save_directory):
        os.makedirs(save_directory)

    cap = cv2.VideoCapture(1)

    if not cap.isOpened():
        print("Error al abrir la cámara")
        return

    for i in range(totalImages):
        ret, frame = cap.read()
        if ret:
            filename = os.path.join(save_directory, f"image_{i + 1}.png")
            cv2.imwrite(filename, frame)
            print(f"Imagen {i + 1} guardada como {filename}")
        else:
            print(f"Error capturando la imagen {i + 1}")

        time.sleep(interval)

    cap.release()
    print(f"Proceso completado. Las imágenes están guardadas en {save_directory}")


captureImages(interval = 4, totalImages = 100)
