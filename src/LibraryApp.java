import com.sun.source.tree.Tree;

import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {
        // Step 2.1
        List<Book> catalog = new ArrayList<>();
        catalog.add(new Book(305, "Data Structures", 2));
        catalog.add(new Book(102, "Java Programming", 1));
        catalog.add(new Book(204, "Operating Systems", 3));
        catalog.add(new Book(150, "Algorithms", 1));

        catalog.sort(Comparator.comparing(Book::getTitle));
        System.out.println("====================================================================");
        System.out.println("First part -> Comparator Sorting of lists");


        LibraryUtils.printList("Book List", catalog);

        // Step 2.2
        Set<String> registeredEmails = new HashSet<>();
        registeredEmails.add("ali@campus.edu");
        registeredEmails.add("sara@campus.edu");
        registeredEmails.add("ali@campus.edu");
        System.out.println("====================================================================");
        System.out.println("Second part -> Hashset of registered emails");
        for (String email : registeredEmails) {
            System.out.println(email);
        }
        System.out.println("Amount of registered emails: " + registeredEmails.size());



        System.out.println("====================================================================");

        //Step 2.3 Fast Student Lookup vs sorted book registry
        Map<Integer,String>studentDirectory = new HashMap<>();
        studentDirectory.put(1001,"Ali");
        studentDirectory.put(1002,"Sara");
        studentDirectory.put(1003,"Omar");
        studentDirectory.put(1004,"Jesse");
        System.out.println("------Fast Lookup(get->1002)------");
        System.out.println(studentDirectory.get(1002));


        Map<Integer,String> sortedBookRegistry = new TreeMap<>();
        sortedBookRegistry.put(305,"First Input 305");
        sortedBookRegistry.put(102,"Second Input 102");
        sortedBookRegistry.put(204,"Third Input 204");
        System.out.println("------Sort by Book ID------");
        for (Integer key : sortedBookRegistry.keySet()) {
            System.out.println(key + " -> " + sortedBookRegistry.get(key));
        }



        //Step 2.4 priorityQueue
        System.out.println("====================================================================");
        System.out.println("PriorityQueue");
        Queue<Book>restockQueue = new PriorityQueue<>(Comparator.comparingInt(Book::getPriority));

        for (Book book : catalog) {
            restockQueue.offer(book);
        }

        while (!restockQueue.isEmpty()) {
            Book book = restockQueue.poll();
            System.out.println(book);
        }



        System.out.println("====================================================================");
        System.out.println("ArrayQueue");
        //Step 2.5 Help Desk Queue (ArrayDeque)
        Queue<String> helpDeskLine = new ArrayDeque<>();
        helpDeskLine.offer("Ali");
        helpDeskLine.offer("Sara");
        helpDeskLine.offer("Omar");

        while (!helpDeskLine.isEmpty()) {
            String line = helpDeskLine.poll();
            System.out.println(line);
            System.out.println("Remaining count : " + helpDeskLine.size() );
            System.out.println("People left : ");
            for (String key : helpDeskLine) {
                System.out.print(key + ", ");
            }
        }

        Deque<String> adminUndoStack = new ArrayDeque<>();
        adminUndoStack.push("Added Book #305");
        adminUndoStack.push("Added Book #102");
        adminUndoStack.push("Added Book #204");

        String popped =  adminUndoStack.pop();
        System.out.println("Action Popped : " + popped);




    }
}