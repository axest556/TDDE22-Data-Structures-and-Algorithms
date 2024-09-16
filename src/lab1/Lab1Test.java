package lab1;

public class Lab1Test {

    public static void main(String[] args) {
        // Create a new SymbolTable :)
        SymbolTable st = new SymbolTable();

        // Test 1: Insert a new key-value pair
        System.out.println("Test 1: Insert 'abc' with type 'a'");
        st.put("abc", 'a');
        System.out.println("Expected: 'a', Actual: " + st.get("abc"));

        // Test 2: Insert another key-value pair with collision
        System.out.println("Test 2: Insert 'bca' with type 'b' (possible collision with 'abc')");
        st.put("bca", 'b');
        System.out.println("Expected: 'b', Actual: " + st.get("bca"));

        // Test 3: Update an existing key
        System.out.println("Test 3: Update 'abc' to type 'z'");
        st.put("abc", 'z');
        System.out.println("Expected: 'z', Actual: " + st.get("abc"));

        // Test 4: Insert a key with null value (should delete the key)
        System.out.println("Test 4: Delete 'abc' by inserting with null value");
        st.put("abc", null);
        System.out.println("Expected: null, Actual: " + st.get("abc"));

        // Test 5: Lookup for a non-existent key
        System.out.println("Test 5: Lookup 'xyz' (non-existent key)");
        System.out.println("Expected: null, Actual: " + st.get("xyz"));

        // Test 6: Insert and delete multiple keys
        System.out.println("Test 6: Insert 'key1', 'key2', 'key3', then delete 'key2'");
        st.put("key1", 'x');
        st.put("key2", 'y');
        st.put("key3", 'z');
        st.delete("key2");
        System.out.println("Expected: 'x', Actual: " + st.get("key1"));
        System.out.println("Expected: null, Actual: " + st.get("key2"));
        System.out.println("Expected: 'z', Actual: " + st.get("key3"));
        
        // Test 7: Delete a non-existing key-value pair
        System.out.println("Test 7: Delete 'cab' that is non-existing");
        st.delete("cab");
        System.out.println("Expected: null, Actual: " + st.get("cab"));
        
        // Test 8: Insert a value with null key (should be undefined)
        System.out.println("Test 8: Make undefinied by inserting null key");
        st.put(null, 'X');
        System.out.println("Expected: Undefined. Dumping table: ");
        st.dump();
        
        // Final Test: Lookup from full table.
        System.out.println("Final Test: Fill the whole table");
        st.put("key4", 'a');
        st.put("key5", 'b');
        st.put("key6", 'c');
        st.put("key7", 'd');
        System.out.println("Dumping the entire symbol table");
        st.dump();
        System.out.println("Final Test: Lookup 'key6' (existing key)");
        System.out.println("Expected: c, Actual: " + st.get("key6"));
        System.out.println("Final Test: Lookup 'xyz' (non-existent key)");
        System.out.println("Expected: Undefined, Actual: " + st.get("xyz"));
        
    }
}

