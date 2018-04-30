CC=gcc
CFLAGS=-g -Wall -Wextra -Wpedantic $(shell pkg-config glib-2.0 --cflags)
LIBS=$(shell pkg-config glib-2.0 --libs)

run: oberon
	./oberon

oberon: main.c buf.c lex.c parse.c type.c
	$(CC) $(CFLAGS) -o $(@) main.c $(LIBS)

clean:
	rm oberon
