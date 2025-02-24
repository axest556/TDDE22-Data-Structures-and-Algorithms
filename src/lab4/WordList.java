package lab4;

import java.util.Vector;
import java.io.*;
import java.util.HashSet;
import java.util.HashMap;
/**
 * The WordList class contains a word list and a data structure
 * containing already used words.
 */
class WordList {
	static private HashSet<String> list; // ordlista
    static private HashSet<String> used; // databas med använda ord
    static private HashMap<Integer, String> mapWithWords;
    static int wordLength;
    static int size; // antal ord i ordlistan

    /**
     * Read reads a word list from the stream "input". All words
     * should have wordLength characters. 
     *
     * @param wordLength_ - the length of the words contained within
     * the word list (int)
     * @param input - the stream from which to read the word list
     * (BufferedReader)
     */
    static public void read(int wordLength_, BufferedReader input) throws IOException {
	wordLength = wordLength_;
	size = 0;
	list = new HashSet<>();
	mapWithWords = new HashMap<>();
	while (true) {
	    String s = input.readLine();
	    if (s.equals("#")) {
		break;
	    }
	    if (s.length() != wordLength) {
		System.out.println("Rad " + size +
				   " i filen innehåller inte " +
				   wordLength + " tecken.");
	    }
	    list.add(s);
	    mapWithWords.put(size, s);
	    size++;
	}
	used = new HashSet<>(size);
    }

    /**
     * WordAt returns the word with the given index in the list.
     * Hint: May not be necessary depending on what changes you make.
     *
     * @param index - the desired index (int)
     * @return - the word located at the index in question, if it
     * exists. If it doesn't exist, null is returned (String)
     */
  
    /**
     * Contains finds w in the word list and returns it back if the
     * word exists, otherwise null is returned.
     *
     * @param w - The word we are looking for (String)
     * @return - w if the word exists, otherwise null is returned
     * (String)
     */
    static public String contains(String w) {
	if (list.contains(w)) {
	    return w;
	}
	return null;
    }

    /**  
     * Checks if the words has been used previously and return false
     * if so. If not, the word is flagged as used and true is returned.
     */ 
    static public boolean markAsUsedIfUnused(String w) {
	if (used.contains(w)) {
	    return false;
	}
	used.add(w);
	return true;
    }

    /**
     * Clears the list of used words.
     */
	static public void eraseUsed() {
		used.clear();
	}

	static public String wordAt(int index) {
            return mapWithWords.get(index);
    }
}
