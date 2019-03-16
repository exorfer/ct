echo Begin Build
mkdir out
kotlinc -d out/codetrain.jar -include-runtime src
echo End Build