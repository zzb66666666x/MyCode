CLASS_DIR = ../bin/
JFLAGS = -g -encoding utf-8 -d
JC = javac

SRC = $(wildcard *.java) $(wildcard Hello/*.java) \
$(wildcard formatting_print/*.java) $(wildcard clock/*.java)

CLASSES = $(addprefix $(CLASS_DIR), $(patsubst %.java, %.class, $(SRC)))


all: $(SRC)                     
	$(JC) $(JFLAGS) $(CLASS_DIR) $(SRC) 

clean:
	rm $(CLASSES)


