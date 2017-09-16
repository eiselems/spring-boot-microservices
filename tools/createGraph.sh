rm file.png
cat architecture.dot | docker container run --rm -i vladgolubev/dot2png > file.png
open file.png