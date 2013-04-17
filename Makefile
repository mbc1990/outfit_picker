#OUTFIT PICKER MAKEFILE

###############################
# COMPILER AND COMPILER FLAGS #
###############################
JC = javac
JFLAGS = -g -Xlint


############
# PACKAGES #
############

PACKAGES = \
	outfitPicker

###########################
# GET READY FOR BUILDING! #
###########################
export PICKER_ROOT:= $(CURDIR)

#######################
# MAIN MAKEFILE RULES #
#######################

# Clear default targets for building
.SUFFIXES: .java .class

all:
	$(JC) $(JFLAGS) $(PICKER_ROOT)/*.java


# A messy rule for clearing out all ".class" files,
# as well as any junk left by vim or emacs
clean:
	@find $(PICKER_ROOT) -name "*.class" | xargs rm -f
	@find $(PICKER_ROOT) -name "*~" | xargs rm -f
	@find $(PICKER_ROOT) -name "\#*" | xargs rm -f


# Create exuberant tags.
tags:
	@find . -name *.java | etags -
