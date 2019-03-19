#python script to remove all ".class" files before pushing assignments into git.
#Rak3sh

import os,sys

for file in (os.listdir(os.getcwd())):
	if (file.endswith(".class")):
		print("removing: " + file)
		os.remove(file)
sys.stderr.write('\x1b[1;31m' + "all files removed".strip() + '\x1b[0m' + '\n')