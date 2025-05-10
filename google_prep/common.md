Two Sum

Problem: Given an array of integers nums and a target T, return indices of the two numbers such that they add up to T.

Key skills: Hash-map lookup, one-pass solution, handling duplicates.

Why it matters: Tests your ability to trade space for time and write clean, constant-time lookups.

Longest Substring Without Repeating Characters

Problem: Given a string, find the length of the longest substring without repeating characters.

Key skills: Sliding-window technique, two-pointer invariants, hash-set/map for fast checks.

Why it matters: Shows mastery of windowing for O(n) scans and elegant pointer manipulation.

Merge Intervals

Problem: Given a collection of intervals, merge all overlapping intervals.

Key skills: Sorting by start time, in-place list manipulation, careful edge-case handling.

Why it matters: Often appears in scheduling/test-coverage scenarios—merging overlapping test ranges or logs.

Implement LRU Cache

Problem: Design a data structure that supports get(key) and put(key, value) in O(1) time, evicting the least-recently used entry when capacity is exceeded.

Key skills: Doubly-linked list + hash map, careful pointer updates, class/design clarity.

Why it matters: Tests your knowledge of combining data structures, and writing test-friendly interfaces.

Find Median from Data Stream

Problem: Continuously read numbers and at any point return the median of all elements seen so far.

Key skills: Two heaps (max-heap/min-heap), balancing invariants, streaming algorithms.

Why it matters: Simulates live-data testing or performance-monitoring use cases.

Word Ladder (Shortest Transformation Sequence)

Problem: Given a beginWord, endWord, and a word list, find the fewest transformations to convert begin to end by changing only one letter at a time, with each intermediate word in the list.

Key skills: Graph modeling, BFS, word-neighbor generation, handling large input sets.

Why it matters: Illustrates your ability to abstract a problem into a graph and use level-order search.

Serialize and Deserialize a Binary Tree

Problem: Convert a binary tree into a string (or byte stream) and back, ensuring the structure is preserved.

Key skills: Recursion vs. iterative (queue) traversal, delimiter-based encoding, null-node handling.

Why it matters: Tests your thinking on data persistence, state capture, and reliable parsing—core to test harness design.

Design a Simple File System

Problem: Implement mkdir(path), addContentToFile(path, content), and readContentFromFile(path).

Key skills: Tree (trie) structure, map children, lazy creation, string parsing.

Why it matters: Echoes real-world test frameworks that must simulate or validate file-based operations.

Minimum Window Substring

Problem: Given strings S and T, find the smallest substring in S that contains all characters of T.

Key skills: Sliding window with counts, shrinking/expanding pointers, multiple-character frequency tracking.

Why it matters: Demonstrates nuanced window management and multi-set containment logic.

Concurrency Exercise: Thread-Safe Counter or Bounded Buffer

Problem (example): Implement a thread-safe counter with atomic increment/decrement, or a producer-consumer buffer with blocking enqueue/dequeue.

Key skills: Locks/mutexes, condition variables (or language-specific concurrent primitives), avoiding deadlock.

Why it matters: Google’s Test Engineers often need to verify multithreaded components and ensure robust test harnesses.

