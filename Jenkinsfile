pipeline {
    agent any

    stages {
        
        stage('Build') {
            
            steps {
                echo 'Building Application'
            }
        }
        stage('Test') {
            
            steps {
                echo 'Testing Application'
            }
        }
        stage('Deploy') {
            
            steps {
                echo 'Deploying Application'
            }
        }
    }
    post
    {
       always{
           
           emailext body: 'My pipeline works!! YAayyy ME! :D', subject: 'Test email for Pipeline status', to: 'learningtestemail@gmail.com'
       }
   }

}
