# Word Frequency Counter

## Overview
This Java program reads text input from the user and counts the frequency of each word in the text using HashMap. It then prints out each word and its corresponding frequency sorted in alphabetical order.

## Setup and Input
1. **Prompt**: The program prompts user to enter text.
2. **Input**: Uses Scanner class to read input from the console.

## Processing
1. **Splitting Text**: Split the input text into words using the split() method of the String class.
2. **Normalization**: Normalize the words by converting them to lowercase to ensure the frequency count is case-insensitive.
3. **HashMap Usage**: Create a HashMap where the keys are words, and the values are the counts of each word.
4. **Updating Frequencies**: Iterate over the array of words, and for each word:
   - If the word is already a key in the HashMap, increment its associated value.
   - If the word is not already a key, add it to the HashMap with a value of 1.

## Output
After processing words, print out each word and its corresponding frequency in the format `Word: Frequency`. Ensure output is sorted in alphabetical order by word.

