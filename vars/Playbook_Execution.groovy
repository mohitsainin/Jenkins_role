def call() {
    stage('playbook execution') {

        sh "ansible-playbook jenkins/tests/test.yml -i jenkins/tests/inventory "
    }
}

