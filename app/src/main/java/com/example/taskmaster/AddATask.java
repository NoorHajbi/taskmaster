package com.example.taskmaster;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amplifyframework.api.graphql.model.ModelMutation;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Task;
import com.example.taskmaster.DB.AppDatabase;

public class AddATask extends AppCompatActivity {
    //    AppDatabase database;
    EditText editTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_atask);

//        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "task_DB")
//                .allowMainThreadQueries()
//                .build();
        editTitle = AddATask.this.findViewById(R.id.edit_myTask);
        EditText editDescription = AddATask.this.findViewById(R.id.edit_doSomething);

        Context context = getApplicationContext();
        CharSequence text = "Submitted!";
        int duration = Toast.LENGTH_SHORT;
        final Toast toast = Toast.makeText(context, text, duration);
        Button addTaskButton = AddATask.this.findViewById(R.id.button_addTask);
        addTaskButton.setOnClickListener(view -> {
            toast.show();
            // save data
            Task newTask = Task.builder()
                    .title(editTitle.getText().toString())
                    .body(editDescription.getText().toString()).build();

            Amplify.API.mutate(ModelMutation.create(newTask),
                    response -> Log.i("Task", "successfully added" + newTask.getTitle()),
                    error -> Log.e("Task", error.toString()));

//            database.taskDao().insertOne(newTask);
            Intent goToMainActivity = new Intent(AddATask.this, MainActivity.class);
            AddATask.this.startActivity(goToMainActivity);

        });

    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onClick(View view) {
//        Log.i(TAG, "onClick: new way was called");

        switch (view.getId()) {
            case R.id.buttonMain_addTask:
                editTitle.setText("Hello");
                break;
            case R.id.button_addTask:
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("input", editTitle.getText().toString());
                startActivity(intent);
                break;
        }
    }

}

