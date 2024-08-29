package com.example.randomquotegenerator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private RelativeLayout mainLayout;
    private String[] quotes = {
            "The only way to do great work is to love what you do. – Steve Jobs",
            "Life is what happens when you’re busy making other plans. – John Lennon",
            "Get busy living or get busy dying. – Stephen King",
            "You have within you right now, everything you need to deal with whatever the world can throw at you. – Brian Tracy",
            "Believe you can and you’re halfway there. – Theodore Roosevelt",
            "The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt",
            "The purpose of our lives is to be happy. – Dalai Lama",
            "Life is really simple, but we insist on making it complicated. – Confucius",
            "In the end, it’s not the years in your life that count. It’s the life in your years. – Abraham Lincoln",
            "You miss 100% of the shots you don’t take. – Wayne Gretzky",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
            "Don’t watch the clock; do what it does. Keep going. – Sam Levenson",
            "A journey of a thousand miles begins with a single step. – Lao Tzu",
            "Success is not how high you have climbed, but how you make a positive difference to the world. – Roy T. Bennett",
            "Don’t settle for what life gives you; make life better and build something. – Ashton Kutcher",
            "Everything you can imagine is real. – Pablo Picasso",
            "Whatever you are, be a good one. – Abraham Lincoln",
            "What we think, we become. – Buddha",
            "Believe you can and you’re halfway there. – Theodore Roosevelt",
            "The best way to predict the future is to invent it. – Alan Kay",
            "You only live once, but if you do it right, once is enough. – Mae West",
            "Your time is limited, so don’t waste it living someone else’s life. – Steve Jobs",
            "The best way to get started is to quit talking and begin doing. – Walt Disney",
            "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. – James Cameron",
            "Success usually comes to those who are too busy to be looking for it. – Henry David Thoreau",
            "Don’t be afraid to give up the good to go for the great. – John D. Rockefeller",
            "I find that the harder I work, the more luck I seem to have. – Thomas Jefferson",
            "Success is not in what you have, but who you are. – Bo Bennett",
            "The way to get started is to quit talking and begin doing. – Walt Disney",
            "If you really look closely, most overnight successes took a long time. – Steve Jobs",
            "The secret of success is to do the common thing uncommonly well. – John D. Rockefeller Jr.",
            "I never dreamed about success. I worked for it. – Estee Lauder",
            "Success seems to be connected with action. Successful people keep moving. – Conrad Hilton",
            "In order to succeed, your desire for success should be greater than your fear of failure. – Bill Cosby",
            "The only place where success comes before work is in the dictionary. – Vidal Sassoon",
            "If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on. – Sheryl Sandberg",
            "If you want to achieve greatness stop asking for permission. – Anonymous",
            "Start where you are. Use what you have. Do what you can. – Arthur Ashe",
            "The best revenge is massive success. – Frank Sinatra",
            "The whole secret of a successful life is to find out what is one’s destiny to do, and then do it. – Henry Ford",
            "If you want to live a happy life, tie it to a goal, not to people or things. – Albert Einstein",
            "Never let the fear of striking out keep you from playing the game. – Babe Ruth",
            "Money and success don’t change people; they merely amplify what is already there. – Will Smith",
            "Your time is limited, so don’t waste it living someone else’s life. – Steve Jobs",
            "Not how long, but how well you have lived is the main thing. – Seneca",
            "If life were predictable it would cease to be life, and be without flavor. – Eleanor Roosevelt",
            "The big lesson in life, baby, is never be scared of anyone or anything. – Frank Sinatra",
            "Curiosity about life in all its aspects, I think, is still the secret of great creative people. – Leo Burnett",
            "Life is not a problem to be solved, but a reality to be experienced. – Soren Kierkegaard",
            "The unexamined life is not worth living. – Socrates",
            "Turn your wounds into wisdom. – Oprah Winfrey",
            "The purpose of life is not to be happy. It is to be useful, to be honorable, to be compassionate, to have it make some difference that you have lived and lived well. – Ralph Waldo Emerson",
            "Don't cry because it's over, smile because it happened. – Dr. Seuss",
            "To live is the rarest thing in the world. Most people exist, that is all. – Oscar Wilde",
            "Life is short, and it is up to you to make it sweet. – Sarah Louise Delany",
            "Good friends, good books, and a sleepy conscience: this is the ideal life. – Mark Twain",
            "Life itself is the most wonderful fairy tale. – Hans Christian Andersen",
            "Do not take life too seriously. You will never get out of it alive. – Elbert Hubbard",
            "Keep calm and carry on. – Winston Churchill",
            "The best way to predict your future is to create it. – Peter Drucker",
            "The only thing standing between you and your goal is the story you keep telling yourself as to why you can’t achieve it. – Jordan Belfort",
            "Act as if what you do makes a difference. It does. – William James",
            "It is never too late to be what you might have been. – George Eliot",
            "We become what we think about. – Earl Nightingale",
            "Dream big and dare to fail. – Norman Vaughan",
            "You may be disappointed if you fail, but you are doomed if you don’t try. – Beverly Sills",
            "The only way to do great work is to love what you do. – Steve Jobs",
            "Change your thoughts and you change your world. – Norman Vincent Peale",
            "There is no way to happiness - happiness is the way. – Thich Nhat Hanh",
            "The biggest adventure you can take is to live the life of your dreams. – Oprah Winfrey",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful. – Albert Schweitzer",
            "The harder the conflict, the greater the triumph. – George Washington",
            "Success is not how high you have climbed, but how you make a positive difference to the world. – Roy T. Bennett",
            "Don't count the days, make the days count. – Muhammad Ali",
            "The most difficult thing is the decision to act, the rest is merely tenacity. – Amelia Earhart",
            "Success usually comes to those who are too busy to be looking for it. – Henry David Thoreau",
            "The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt",
            "The best way to find yourself is to lose yourself in the service of others. – Mahatma Gandhi",
            "Life is what happens when you’re busy making other plans. – John Lennon",
            "The best revenge is massive success. – Frank Sinatra",
            "Life is short, and it is up to you to make it sweet. – Sarah Louise Delany",
            "Do not take life too seriously. You will never get out of it alive. – Elbert Hubbard",
            "Turn your wounds into wisdom. – Oprah Winfrey",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
            "Don’t watch the clock; do what it does. Keep going. – Sam Levenson",
            "The best way to get started is to quit talking and begin doing. – Walt Disney",
            "Success is not in what you have, but who you are. – Bo Bennett",
            "It is never too late to be what you might have been. – George Eliot",
            "Dream big and dare to fail. – Norman Vaughan",
            "Don’t be afraid to give up the good to go for the great. – John D. Rockefeller",
            "Change your thoughts and you change your world. – Norman Vincent Peale"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        mainLayout = findViewById(R.id.mainLayout);

        Button newQuoteButton = findViewById(R.id.newQuoteButton);
        Button shareButton = findViewById(R.id.shareButton);

        newQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNewQuote();
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareQuote();
            }
        });
    }

    private void generateNewQuote() {
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);
        String newQuote = quotes[randomIndex];
        quoteTextView.setText(newQuote);
        changeBackgroundColor();
    }

    private void changeBackgroundColor() {
        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mainLayout.setBackgroundColor(color);
    }

    private void shareQuote() {
        String quoteToShare = quoteTextView.getText().toString();
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, quoteToShare);
        startActivity(Intent.createChooser(shareIntent, "Share quote via"));
    }
}
