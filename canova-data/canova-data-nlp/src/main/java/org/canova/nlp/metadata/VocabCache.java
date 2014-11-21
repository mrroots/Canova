package org.canova.nlp.metadata;

import org.canova.api.conf.Configuration;

import java.util.List;

/**
 * Track metadata about vocabs
 *
 * @author Adam Gibson
 */
public interface VocabCache {


    /**
     * Returns a word in the vocab at a particular index
     * @param i the index to get
     * @return the word at that index in the vocab
     */
    String wordAt(int i);

    /**
     * Configuration for initializing
     * @param conf the configuration to initialize with
     */
    void initialize(Configuration conf);

    /**
     * Get the word frequency for a word
     * @param word the word to get frequency for
     * @return the frequency for a given word
     */
    double wordFrequency(String word);

    /**
     * The min word frequency
     * needed to be included in the vocab
     * (default 5)
     * @return the min word frequency to
     * be included in the vocab
     */
    int minWordFrequency();

    /**
     * All of the vocab words (ordered)
     * note that these are not all the possible tokens
     * @return the list of vocab words
     */
    List<String> vocabWords();


    /**
     * Increment the doc count for a word by 1
     * @param word the word to increment the count for
     */
    void incrementDocCount(String word);

    /**
     * Increment the document count for a particular word
     * @param word the word to increment the count for
     * @param by the amount to increment by
     */
    void incrementDocCount(String word,double by);

    /**
     * Increment a word count by 1
     * @param word the word to increment the count for
     */
    void incrementCount(String word);

    /**
     * Increment count for a word
     * @param word the word to increment the count for
     * @param by the amount to increment by
     */
    void incrementCount(String word,double by);

    /**
     * Number of documents word has occurred in
     * @param word the word to get the idf for
     */
    double idf(String word);

    /**
     * Calculate the tfidf of the word given the document frequency
     * @param word the word to get frequency for
     * @param frequency the frequency
     * @return the tfidf for a word
     */
    double tfidf(String word,double frequency);

}