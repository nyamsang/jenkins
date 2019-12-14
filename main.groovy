pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World. I am Jenkins script!'
            }
        }
    }
}