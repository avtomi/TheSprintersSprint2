pipeline {
 agent any
 tools {
  maven 'M3'
 }
  stages {   
    stage('Checkout') {
        steps {
            git url: 'https://github.com/avtomi/TheSprintersSprint2.git',
                branch: 'main'
        }
    }
    stage('Test') {
      steps {
      }
    }
    stage('Build') {
      steps {
        sh "mvn -DskipTests=true clean package"
      }
    }
    stage('Deploy') {
      steps {
        sh "echo 'Deploying'"
      }
    }
  }
}