SRC_DIR = ../src/
CLASS_DIR = ./
JFLAGS = -g -encoding utf-8 -d
JC = javac

SRC = $(wildcard $(SRC_DIR)*.java) $(wildcard $(SRC_DIR)hello/*.java) \
$(wildcard $(SRC_DIR)formatting_print/*.java) $(wildcard $(SRC_DIR)clock/*.java) \
$(wildcard $(SRC_DIR)test_template/*.java)

#    $(subst <aa>,<bb>,<text>) change the aa in text to bb
CLASSES = $(subst $(SRC_DIR), ,$(patsubst %.java, %.class, $(SRC))) \
$(CLASS_DIR)TestClass.class $(CLASS_DIR)hello/helloclass.class  


all: $(SRC)
	@echo $(CLASSES)
	$(JC) $(JFLAGS) $(CLASS_DIR) $(SRC) 

clean:
	rm $(CLASSES)


