# Mis décimos para Android

Aplicación Android sin cuenta ni conexión: los décimos, las fotos y los importes se guardan en el almacenamiento local de la aplicación.

## Crear el APK

1. Abre esta carpeta con Android Studio reciente.
2. Espera a que Gradle sincronice el proyecto y Android SDK Platform 35 esté instalado.
3. Selecciona **Build > Build APK(s)**.
4. El APK de depuración aparecerá en `app/build/outputs/apk/debug/app-debug.apk`.

También se incluye un flujo de GitHub Actions que compila el APK al subir el proyecto a una rama `main` y lo publica como artefacto de la ejecución.

El selector de fotos permite elegir una imagen y, en teléfonos que lo ofrecen, abrir la cámara desde el propio selector.
